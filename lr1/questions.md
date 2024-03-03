# Ответы на вопросы

1) Будет ли исполняться программа без ошибок. Если без ошибок, то почему все работает. Если есть ошибка, то указать:

```java
class SomeScopeExample {
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        System.out.println(teenyBit);
    }
}
```

### Ответ: ошибка заключается в области видимости переменной teenyBit.
---
2) Даны два куска кода. Определить какой из кусков будет работать без ошибок, а какой даст ошибку. В куске, который дает ошибку, объяснить почему:

```java
short bird = 'd';
char mammal = (short)83;
char mammal = 83;
```
```java
short reptile = 65535;
char fish = (short)-1;
char fish = -1;
```

### Ответ: первый кусок кода отработает без ошибок, второй вызовет ошибку. Приведение типа к отрицательному числу не допустимо для типа char, что вызовет ошибку компиляции.
---
3) Почему код ниже не будет компилироваться и как это исправить?
```java
long max = 3123456789;
```

### Ответ: для исправления этой проблемы можно добавить суффикс 'L' или 'l' к числу, чтобы явно указать, что это значение должно быть рассматриваться как тип long.
---
4) Что из нижеперечисленного будет компилироваться, а что нет. И почему:
```java
int value = null;

List<Integer> heights = new ArrayList<>();

heights.add(null);

String s = null;
```

### Ответ: первое не будет компилироваться, остальные будут. Первое - потому что int не может, быть null. Второе - создается объект, который является ссылочным типам. Третье - метод add, позволяет добавлять значение "null". Четвертое - переменные типа "string" могут принимать значения "null"
---
5) Что из нижеперечисленного верно? (Выберите все, что применимо):
- A. Классовая переменная типа "boolean" имеет значение по умолчанию 0
- B. Переменная класса типа boolean по умолчанию имеет значение false. 
- C. Переменная класса типа boolean по дефолту равна null.
- D. Переменная класса типа long по умолчанию имеет значение null
- E. Переменная класса типа long по умолчанию имеет значение 0L
- F. Классовая переменная типа long имеет значение по умолчанию 0
- G. Ничего из вышеперечисленного

### Ответ: B,E
---
6) Что из нижеперечисленного верно? (Выберите все, что применимо):
- A. Локальная переменная типа boolean по умолчанию равна null.
- B. Локальная переменная типа float по умолчанию имеет значение 0.0f.
- C. Локальная переменная типа double по умолчанию равна 0.
- D. Локальная переменная типа Object имеет значение по умолчанию null.
- E. Локальная переменная типа boolean по умолчанию имеет значение false.
- F. Локальная переменная типа float по умолчанию равна 0.0.
- G. Ничего из вышеперечисленного

### Ответ: D, E
---
7) Что из нижеперечисленного верно? (Выберите все, что применимо):
- A. Переменная экземпляра типа float по умолчанию равна 0.
- B. Переменная экземпляра типа char по умолчанию равна null.
- C. Переменная экземпляра типа double имеет значение по умолчанию 0.0.
- D. Переменная экземпляра типа int по умолчанию равна null.
- E. Переменная экземпляра типа String имеет значение по умолчанию null.
- F. Переменная экземпляра типа String по умолчанию принимает значение пустой строки "".
- G. Ничего из вышеперечисленного

### Ответ: E, F
---
8. Какие из следующих утверждений о фрагменте кода являются верны? Выберите все, что применимо.
```java
1. short numPets = 5L;
2. int numGrains = 2.0;
3. String name = "Scruffy";
4. int d = numPets.length();
5. int e = numGrains.length;
6. int f = name.length();
```

### Ответ: 3, 6
---
9. Какой из следующий наименований переменных корректный?
- A. _
- B. _helloWorld$
- C. true
- D. java.lang
- E. Public
- F. 1980_s
- G. _Q2_

### Ответ: A, B, F
---
10. Написать в строках с System.out.println() что выведется в консоль: true или false?
- String firstString = "new";
- String secondString = "new";
- System.out.println(firstString == secondString);
- System.out.println(firstString.equals(secondString));
- String thirdString = new String("new");
- System.out.println(thirdString.equals(secondString));
- System.out.println(thirdString == secondString);
- System.out.println(thirdString.intern() == firstString);
- System.out.println(thirdString.equals(secondString));

### Ответ: True, True, True, False, True, True
---

11. В следующем задании: 1. Определить есть ли ошибки в коде. Если есть, то где и почему. Исправить при наличии 2. Написать цикл, который будет итерироваться по массиву (по поводу цикла: for и forEach):
```java
int[] intArray = {3, 4, 5};
float[] floatArray = float[] {7.2f, 1.8f, 9.3};
char[] charArray = new char[2];
```
### Ответ: 1) Ошибок нет. 2) Ниже описаны алгоритмы для каждого массива:
- Используя цикл for
```java
for (int i = 0; i < intArray.length; i++) {
    System.out.println(intArray[i]);
}
``` 
```java
for (int i = 0; i < intArray.length; i++) {
    System.out.println(intArray[i]);
}
``` 
```java
for (int i = 0; i < intArray.length; i++) {
    System.out.println(intArray[i]);
}
``` 
- Используя цикл foreach

```java
intArray.forEach(System.out::println);
``` 
```java
floatArray.forEach(System.out::println);
``` 
```java
charArray.forEach(System.out::println);
``` 

---
12.  Будет ли объект one доступен для удаления с помощью GC в результате исполнения программы:
```java
public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}
```

### Ответ: После присвоения null, ссылка на объект больше не доступна и garbage collector (GC) может освободить память, которую занимает переменная one
---



