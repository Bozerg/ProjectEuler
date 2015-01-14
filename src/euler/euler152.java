package euler;

import java.util.ArrayList;

public class euler152{
        static int maxInt = 80;
        static ArrayList<Integer> primes = new ArrayList<Integer>();
        static int bases[] = new int[maxInt + 1];
        static ArrayList<Rational> fractions[] = new ArrayList[maxInt + 1];
        static int sequences[] = new int[maxInt - 1];
        static int contain[] = new int[maxInt + 1];
        static int answer = 0;

        public static void main(String args[]) {
                getPrimes();
                buildBases();
                makeFractions();
                sort();

                contain[2] = 2;
                search(0);
                System.out.println(answer);
        }

        static void search(int index) {
                if (index == sequences.length) {
                        answer++;
                        return;
                }
                int n = sequences[index];
                if (contain[n] == 0) {
                        search(index + 1);
                }
                if (contain[n] != 0 || bases[n] == 0) {
                        for (Rational q : fractions[n]) {
                                contain[q.den] -= q.num;
                                balanceAround(q.den);
                        }
                        if (contain[n] == 0) {
                                search(index + 1);
                        }
                        for (Rational q : fractions[n]) {
                                contain[q.den] += q.num;
                                balanceAround(q.den);
                        }
                }
        }

        static void balanceAround(int p) {
                int prime = bases[p];
                int p2 = prime * prime;
                while (p > 1) {
                        if (contain[p] < p2 && contain[p] > -p2) {
                                return;
                        }
                        int up = p / prime;
                        if (contain[p] >= p2) {
                                contain[p] -= p2;
                                contain[up]++;
                        } else if (contain[p] <= -p2) {
                                contain[p] += p2;
                                contain[up]--;
                        }
                        p = up;
                }
        }

        static void sort() {
                boolean used[] = new boolean[maxInt + 1];
                int index = 0;
                while (index < sequences.length) {
                        for (int i = maxInt; i >= 2; i--) {
                                if (!used[i] && bases[i] > 0 && alreadyUsed(i, used) == 0) {
                                        used[i] = true;
                                        sequences[index] = i;
                                        index++;
                                }
                        }
                        for (int i = maxInt; i >= 2; i--) {
                                if (!used[i]) {
                                        used[i] = true;
                                        sequences[index] = i;
                                        index++;
                                        break;
                                }
                        }
                }
        }

        static int alreadyUsed(int n, boolean used[]) {
                int count = 0;
                for (int i = n + n; i <= maxInt; i += n) {
                        if (!used[i]) {
                                count++;
                        }
                }
                return count;
        }
        
        static void buildBases() {
            for (int prime : primes) {
                    for (int j = prime; j < bases.length; j *= prime) {
                            bases[j] = prime;
                    }
            }
        }

        static int[] expandGCD(int a, int b) {
            if (b == 0) {
                    return new int[] { 1, 0 };
            } else {
                    int x[] = expandGCD(b, a % b);
                    return new int[] { x[1], x[0] - a / b * x[1] };
            }
        }	
        
        static void getPrimes() {
                boolean sieved[] = new boolean[maxInt + 1];
                for (int i = 2; i < sieved.length; i++) {
                        if (!sieved[i]) {
                                primes.add(i);
                                for (int j = i + i; j < sieved.length; j += i) {
                                        sieved[j] = true;
                                }
                        }
                }
        }

        static void makeFractions() {
                for (int i = 2; i < fractions.length; i++) {
                        fractions[i] = new ArrayList<Rational>();
                        int m = 1;
                        int n = i;
                        for (int prime : primes) {
                                int p2 = prime * prime;
                                int p = 1;
                                while (n % prime == 0) {
                                        p *= prime;
                                        n /= prime;
                                }
                                if (p > 1) {
                                        int extended[] = expandGCD(n * n, p * p);
                                        extended[0] *= m;
                                        extended[1] *= m;
                                        int k = extended[0] / (p * p);
                                        extended[0] -= k * p * p;
                                        extended[1] += k * n * n;
                                        while (extended[0] != 0) {
                                                if (extended[0] % p2 != 0) {
                                                        fractions[i].add(new Rational(extended[0] % p2, p));
                                                }
                                                p /= prime;
                                                extended[0] /= p2;
                                        }
                                        m = extended[1];
                                }
                        }
                }
        }
}

class Rational { // r = num / den^2
        int num;
        int den;

        Rational(int num, int den) {
                this.num = num;
                this.den = den;
        }
}
