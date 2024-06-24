Отчет о решении 20 задач в на площадке Timus (⌐■_■).
# Задача № 1068. Сумма

#### Условие: всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и _N_ включительно.

```java
package timus

import java.util.Scanner;

public class 1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = n; i <= 1; i++) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}


```

#### Объяснение: решение в лоб - перебором в циклах, т.к решение через формулу арифметической прогрессии сбоило в версии для отрицательных чисел.

---
# Задача № 1197. Один в поле войн

####  Условие: вам всего лишь надо определить, сколько клеток находится под боем шахматного коня, одиноко стоящего на шахматной доске. На всякий случай напомним, что конь ходит буквой «Г» — на две клетки по горизонтали или вертикали в любом направлении, и потом на одну клетку в направлении, перпендикулярном первоначальному.

```java
package timus

import java.util.Scanner;

public class 1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String position = scanner.nextLine();
            int x = position.charAt(0) - 'a' + 1;
            int y = position.charAt(1) - '1' + 1;

            int count = 0;

            for (int j = 0; j < 8; j++) {
                int newX = x + dx[j];
                int newY = y + dy[j];

                if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                    count++;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}

```

#### Объяснение: для каждой позиции проверяем все возможные ходы коня и считаем только те, которые остаются в пределах шахматной доски. Для каждого возможного хода проверяется, находится ли новая позиция в пределах от 1 до 8 по обеим координатам. Результат для каждой позиции выводится в виде количества допустимых ходов.

---

# Задача № 1001

#### Условие: дан ряд чисел. Выведите квадратный корень каждого числа в обратном порядке.

```java
package timus

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        
        while (scanner.hasNextDouble()) {
            numbers.add(scanner.nextDouble());
        }
        
        Collections.reverse(numbers);
        
        for (double number : numbers) {
            System.out.printf("%.4f\n", Math.sqrt(number));
        }
        
        scanner.close();
    }
}

```

#### Объяснение: читаем, пока есть что читать, сохраняем в список, переворачиваем, выводим и вычисляем корень с точностью до 4-х знаков после запятой.

---

# Задача № 1110. Степень

####  Условие: Даны целые числа _N_, _M_ и _Y_.Напишите программу, которая найдёт все целые числа _X_ в диапазоне$[0,M-1]$, такие что $X^{N}|M|=Y$

```java
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        String output = "";
        
        for (int x = 0; x <= b2; x++) {
            if (Math.pow(x, a1) % b2 == c3) {
                output += x + " ";
            }
        }
        if (output != ""){
            output.trim();
            System.out.println(output);
        }
        else{
            System.out.println(-1);
        }
        
        scanner.close();
    }
}

```

Первое решение, было неудачным, как бы я его не оптимизировал, поэтому было принято решение, переписать с нуля заново и оно заработало.

```java
package timus

import java.util.*;

public class 1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();
        
        List<Integer> results = new ArrayList<>();
        
        for (int X = 0; X < M; X++) {
            if (modularExponentiation(X, N, M) == Y) {
                results.add(X);
            }
        }
        
        if (results.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < results.size(); i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(results.get(i));
            }
            System.out.println();
        }
    }
    
    private static int modularExponentiation(int X, int N, int M) {
        if (N == 0) {
            return 1 % M;
        }
        
        long result = 1;
        long base = X % M;
        
        while (N > 0) {
            if (N % 2 == 1) {
                result = (result * base) % M;
            }
            base = (base * base) % M;
            N /= 2;
        }
        
        return (int) result;
    }
}

```
#### Объяснение: для вычисления степени, была описана специальная функция для быстрого вычисления, чтобы обрабатывать быстро большие числа. Теперь по основной программе - по-классике, сканируем, запускаем перебор в цикле for, для каждого x, проверяем условие. Если выполняется, то добавляем в список, далее выводим через пробел в одну строку, но если список пустой, то выводим -1.

---
# Задача № 2001. Математики и ягоды

####  Условие: 

```java
package timus

import java.util.Scanner;

public class 2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считываем входные данные
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();
        
        // Находим массы ягод каждого математика
        int x = a1 - a3; // x + y = a1, y = a3
        int y = b1 - b2; // x + y = b1, x = b2
        
        // Выводим результат
        System.out.println(x + " " + y);
    }
}

```

#### Объяснение: сканируем данные, составляем уравнение и тут на помощь приходят уравнения, произведем расчет массы ягод у каждого математика:
#### где $x$ - масса ягод первого математика, $y$ - масса ягод второго математика.

#### Теперь исходя из данных весов:

#### a1=x+ya1 = x + ya1=x+y (первое взвешивание)
#### a2=xa2 = xa2=x (после того как второй математик пересыпал все к первому)
#### a3=ya3 = ya3=y (после того как первый математик пересыпал все к второму)

#### Ну и наконец составим систему, которую можно решить:

1. $x+y=a1x + y = a1x+y=a1$
2. $x=a2x = a2x=a2$
3. $y=a3y = a3y=a3$

#### Ps: Пришлось посидеть с листочком чуть-чуть, поэтому оставил комментарии в коде, не так очевидны преобразования.

---

# Задача № 1000. A+B Problem

####  Условие: Сложить два числа

```java
package timus

import java.util.Scanner;

public class 1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
    }
}
```

#### Объяснение: сканером получили и сложили два числа. победа?

---
# Задача № 2012. Про Гришу Н.

####  Условие: успеет ли Григорий решить все задачи в соло или нет?

```java
package timus

import java.util.Scanner;

public class 2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int f = scanner.nextInt();
        scanner.close();

        int totalTasks = 12;

        int remainingTasks = totalTasks - f;

        int maxTasksInRemainingTime = 240 / 45;

        if (remainingTasks <= maxTasksInRemainingTime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```

#### Объяснение: считываем сколько задач он хочет решить в первый час, далее считаем, сколько останется решить и его предел, на основании этого выводим справится ли Гриша или нет.

---
# Задача № 1100. Таблица результатов

####  Условие: нужно отфильтровать команды по очкам

```java
package timus

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Чтение количества команд
        int N = Integer.parseInt(reader.readLine());
        int[][] teams = new int[N][3];

        // Чтение данных команд
        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            teams[i][0] = Integer.parseInt(input[0]); // ID
            teams[i][1] = Integer.parseInt(input[1]); // Solved
            teams[i][2] = i; 
        }
        
        reader.close();

        // Сортировка команд по количеству решённых задач (по убыванию), а затем по индексу
        Arrays.sort(teams, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[1] != a[1]) {
                    return b[1] - a[1];
                } else {
                    return a[2] - b[2];
                }
            }
        });

        // Вывод отсортированных данных
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < N; i++) {
            output.append(teams[i][0]).append(" ").append(teams[i][1]).append("\n");
        }
        System.out.print(output);
    }
}

```

#### Объяснение: bufferedreader для быстрого ввода, далее сохраняем данные в двумерный массив, где каждая строка содержит ID и исходный индекс, далее сортируем с помощью компаратора, и выводим одним вызовом.

---
# Задача № 1319. Отель

####  Условие: из правого верхнего угла, расположить числа от 1 до N, по диагонали слева направо.

```java
package timus

import java.util.Scanner;

public class 1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[][] table = new int[N][N];
        
        int number = 1;
        
        // Заполняем таблицу
        int row = 0, col = N - 1; // Начинаем с правого верхнего угла
        
        while (number <= N * N) {
            // Двигаемся вниз по диагонали
            int r = row, c = col;
            while (r < N && c < N) {
                table[r][c] = number++;
                r++;
                c++;
            }
            
            if (col > 0) {
                col--; // Переходим на следующую диагональ влево
            } else {
                row++; // Переходим на следующую диагональ вниз
            }
        }
        
        // Выводим таблицу
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

```

#### Объяснение: создаем двумерный массив размером $N×N$ для хранения чисел, далее переменная `number `увеличивается от 1 до $N^2$, далее используем цикл while, и уже там заполняем диагонали, а после выводим в виде матрицы $N×N$ размерности

---
# Задача № 1263. Выборы

####  Условие: на основе выбора граждан, рассчитать процент голосов для каждого кандидата.

```java
package timus

import java.util.Scanner;

public class 1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Читаем число кандидатов (N) и число избирателей (M)
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // Создаем массив для подсчета голосов за каждого кандидата
        int[] votes = new int[N + 1]; // Индексы от 1 до N
        
        // Читаем голоса избирателей
        for (int i = 0; i < M; i++) {
            int candidate = scanner.nextInt();
            votes[candidate]++;
        }
        
        // Выводим процент голосов за каждого кандидата
        for (int i = 1; i <= N; i++) {
            double percentage = (double) votes[i] / M * 100.0;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}

```

#### Объяснение: в целом код самоописывающийся, - Создаем массив, размером N+1, который будет содержать количество голосов за каждого кандидата.
#### Читаем M строк, в каждой из которых содержится номер кандидата, за которого проголосовал избиратель. Увеличиваем соответствующий элемент массива.
#### Используя формулу вычисляем проценты: $$процент=\left( \frac{\;\text{Голоса за кандидата}\;}{M} \right)×100$$
#### Ну а далее просто выводим результат.

---
# Задача № 1243. Разводка гномов

####  Условие: семь гномов делят вещи между собой поровну, а что не могут поделить, отдают Белоснежке.

```java
package timus

import java.math.BigInteger;
import java.util.Scanner;

public class 1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger N = scanner.nextBigInteger();
        

        BigInteger seven = BigInteger.valueOf(7);
        BigInteger belosnezhkaShare = N.mod(seven);
        
        System.out.println(belosnezhkaShare);
    }
}

```

#### Объяснение: хитрая задача, которая не работает, на примитивных числовых данных и требует иного подхода, поэтому из математики, импортируем BigInteger, далее считываем число предметов, находим остаток от деления на 7 (гномов же 7), и выводим остаток - приданное Белоснежке.

---
# Задача № 1293. Эния

####  Условие: Нужно покрасить N кол-во пластин, шириной A, и длинной B с двух сторон.

```java
package timus

import java.util.Scanner;

public class 1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        System.out.print(N*(A*B*2));
    }
}
```

#### Объяснение: считываем три параметра, перемножаем между собой и на два (две стороны).

---
# Задача № 2066. Простое выражение

####  Условие: даны 3 числа, каждое из которых, не меньше предыдущего и нужно получить из них наименьшее возможное число, путем комбинирования трех операций.

```java
package timus

import java.util.Scanner;

public class 2066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        

        int result1 = a + b + c;
        int result2 = a + b - c;
        int result3 = a + b * c;
        int result4 = a - b + c;
        int result5 = a - b - c;
        int result6 = a - b * c;
        int result7 = a * b + c;
        int result8 = a * b - c;
        int result9 = a * b * c;
        
        int minValue = Math.min(result1, Math.min(result2, Math.min(result3, Math.min(result4, 
                        Math.min(result5, Math.min(result6, Math.min(result7, Math.min(result8, result9))))))));
        
        System.out.println(minValue);
    }
}

```

#### Объяснение: получил числа и полным перебором определил комбинацию которая дает минимальный результат.


---
# Задача № 2111. Платон

####  Условие: рассчитать стоимость поездок по городам

```java
package timus

import java.util.Scanner;

public class 2111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] distances = new int[n];
        long sumOfDistances = 0;

        for (int i = 0; i < n; i++) {
            distances[i] = scanner.nextInt();
            sumOfDistances += distances[i];
        }

        long minTax = sumOfDistances * sumOfDistances;

        System.out.println(minTax);
    }
}

```

#### Объяснение: читаем, считаем и выводим. подробнее стоит остановится на математике - суммируя все расстояния и возводя эту сумму в квадрат, фактически суммируем произведения каждого расстояния со всеми остальными расстояниями (и с самим собой), что идеально для расчета общего налога.

---

# Задача № 1264. Трудовые будни

####  Условие: за сколько секунд Петечкин напишет функцию

```java
package timus

import java.util.Scanner;

public class 1264 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        scanner.close();

        // Парсим входные данные N и M
        String[] tokens = input.split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);

        // Вычисляем количество секунд, требуемых Петечкину на написание функции
        long timeInSeconds = (long) N * (M + 1);

        // Выводим результат
        System.out.println(timeInSeconds);
    }
}

```

#### Объяснение: считываем, разделяем и считаем по формуле, т.к результат теоретически может быть огромен, то используем тип long и выводим.

---

# Задача № 1209. 1, 10, 100, 1000...

####  Условие: выведите через пробел $N$ цифр. $i$-я цифра должна равняться цифре, которая находится в описанной выше последовательности на позиции с $Ki$ номером.

```java
package timus

import java.util.Scanner;

public class 1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        for(long i = 0; i < n; i++){
            long x = in.nextLong() - 1;

            long y = (long) Math.sqrt(8 * x + 1);
            if (y * y == (8 * x + 1)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
```

#### Объяснение: считываем, уменьшаем для удобства индекс, далее решаем уравнение для каждого числа, чтобы проверить наличие целого решения, а это нужно чтобы понять - является ли число - треугольным. Далее выводим ответ согласно правилам, является - 1, нет - 0.


---
# Задача № 1787. Поворот на Мегу

####  Условие: По входному времени определить сколько машин стоит в пробке на повороте в ТЦ

```java
package timus

import java.util.Scanner;

public class 1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        
        int[] cars = new int[n];
        for (int i = 0; i < n; i++) {
            cars[i] = scanner.nextInt();
        }
        scanner.close();

        int queue = 0;
        
        for (int i = 0; i < n; i++) {
            queue += cars[i];
            if (queue > k) {
                queue -= k;
            } else {
                queue = 0;
            }
        }
        
        System.out.println(queue);
    }
}

```

#### Объяснение: считываем количество машин в минуту и количество минут, создаем массив для хранения количества машин. Проходимся по каждой минуте, обновляя счетчик и выводим результат.

---
# Задача № 1909. Космическая разведка

####  Условие: по матрице значений вычислить разобьется ли дрон зная центр и радиус планеты, положение и вектора скорости дронов.

```java
package timus

import java.util.*;
import java.io.*;

// Подготавливаем основу для работы с векторами
public class 1909 {
    static class Vec {
        double x, y, z;

        Vec(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        Vec subtract(Vec v) {
            return new Vec(x - v.x, y - v.y, z - v.z);
        }

        Vec add(Vec v) {
            return new Vec(x + v.x, y + v.y, z + v.z);
        }

        double dot(Vec v) {
            return x * v.x + y * v.y + z * v.z;
        }

        Vec multiply(double f) {
            return new Vec(x * f, y * f, z * f);
        }

        Vec divide(double f) {
            return new Vec(x / f, y / f, z / f);
        }

        Vec cross(Vec v) {
            return new Vec(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
        }

        double norm() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        double norm2() {
            return x * x + y * y + z * z;
        }

        Vec normalize() {
            double d = norm();
            return new Vec(x / d, y / d, z / d);
        }
    }

    static double eps = 1e-9;

    static double dv(double x, double r) {
        return x / Math.sqrt(r * r - x * x);
    }

    static double find(double r, double k) {
        double L = -r, R = r;
        while (R - L > 1e-9) {
            double m = L + (R - L) / 2;
            if (dv(m, r) < k)
                L = m;
            else
                R = m;
        }
        return R;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Vec c, p1, p2, v;
        double R;

		// Чтение координат планеты и радиуса
        st = new StringTokenizer(br.readLine());
        c = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
        R = Double.parseDouble(st.nextToken());

		// Чтение координат первого зонда
        st = new StringTokenizer(br.readLine());
        p1 = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));

		// Чтение координат второго зонда
        st = new StringTokenizer(br.readLine());
        p2 = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));

		// Чтение вектора скорости
        st = new StringTokenizer(br.readLine());
        v = new Vec(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
        v = v.normalize(); // Нормализуем вектор скорости

		// Инициализируем дополнительные переменные и проверяем
		// Парралельность векторов
        Vec w = p2.subtract(p1);
        Vec a = new Vec(0, 0, 0), b = new Vec(0, 0, 0);
        double cx, cy, cz;
        boolean along = false;

        if (Math.abs(v.cross(w.normalize()).norm()) < 1e-5) {
            w = new Vec(1000001, 1000002, 1000003);
            along = true;
        }

        a = w.cross(v).normalize();
        b = v.cross(a).normalize();

        double x = w.dot(b), y = v.dot(w);
        // Вычисление проекций и проверки
        cy = c.subtract(p1).dot(a);
        cx = c.subtract(p1).dot(b);
        cz = c.subtract(p1).dot(v);

        double d = w.cross(v).cross(w).dot(c.subtract(p1));
        double D = R * R - cy * cy;

        if (D < -eps) {
            System.out.println("False alarm");
            return;
        }

        if (along) {
            eps = 1e-5;
            if (d > 0 && cx * cx + cy * cy <= R * R + eps || (cx - x) * (cx - x) + cy * cy <= R * R + eps) {
                System.out.println("Crash");
                return;
            }
        }

        if (!along) {
            D = Math.max(D, 0);
            double x1 = cx - Math.sqrt(D);
            double x2 = cx + Math.sqrt(D);

            double p = find(Math.sqrt(D), y / x);
            Vec intersectionPoint = p1.add(w.normalize().multiply(p + cx).divide(w.dot(b) / w.norm()));

            if (p + cx > eps && p + cx < x - eps && c.subtract(intersectionPoint).dot(v) > -eps) {
                System.out.println("Warning");
                return;
            }

            if (v.dot(c.subtract(p1)) > -eps && x1 < eps && x2 > -eps || v.dot(c.subtract(p2)) > -eps && x1 < x + eps && x2 > x - eps) {
                System.out.println("Crash");
                return;
            }
        }

        System.out.println("False alarm");
    }
}

```

#### Объяснение: сложнейшая задача, в самом начале создаем класс Vec (от слова Vector), без него никуда, он необходим для компактной работы в трехмерных координатах, поэтому прописываем основные операции с векторами:  создание вектора, выполнение операции вычитания, сложение, скалярное произведение, умножение на число, деление на число, векторное произведение, вычисление нормы вектора и нормы в квадрате, а также нормализация вектора.

#### Далее получаем данные и корректно их инициализируем, для это создаем `StringTokenizer`, он помогает разбить каждую строку на отдельные числовые элементы, которые затем преобразуются в координаты планет, зондов и вектора скорости. Это важно для дальнейших расчетов.

#### После чтения координат и вектора скорости, мы вычисляем вектор между двумя зондами `w`. Если вектор скорости `v` параллелен `w`, то это значит, что он либо направлен вдоль линии между зондами, либо перпендикулярен ей. В таком случае производится замена `w` на произвольный вектор (например, `(1000001, 1000002, 1000003)`), чтобы избежать деления на ноль при вычислении перпендикуляра.

#### И только теперь можно переходить к вычислениям проекций на новую систему координат, которая построена на ранее созданных векторах `v` , `w` и их перпендикулярах. Далее просто проводим проверки: 
#### - Проверка на столкновение (Crash): Проверяем, произошло ли столкновение планеты с зондами. Это делается через вычисление расстояний от планеты до оси между зондами и проверку, находится ли планета в пределах радиуса R от этой оси.

#### - Проверка на предупреждение (Warning): Если столкновение не произошло, но зонды движутся в сторону планеты, то проверяем, находится ли планета в пределах опасной близости от пути зондов. Это делается через бинарный поиск и проверку дистанции от планеты до прямой, соединяющей зонды.

#### - Фальшивая тревога (False alarm): Если ни одно из вышеупомянутых условий не выполнено, выводим "False alarm", что означает отсутствие опасности столкновения или приближения планеты к зондам.

---

#### Итог: Timus стал настоящим открытием, потому что в свете последних новостей: Leetcode, codewars, github и т.д могут быть отдалены от нас. Были решены 20 увлекательных задач, практически в каждой есть своя особенность, одна из них, оказалось особо сложной, на неё ушло более 20 попыток проверок, прежде чем был достигнут результат "Accepted". Однако, все это с лихвой окупится при дальнейшем изучении языка, прохождении собеседований и развитии логического мышления.
