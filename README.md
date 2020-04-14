# Task 3
:mortar_board: :mortar_board: Task 3 состоит из двух задач. Все заготовки задач находятся внутри проекта в пакете *org.example.rs.android_stage1_task3* в папке *src/main/java*. В каждой заготовке вам дан класс с открытым методом, в который нужно написать код для решения поставленной задачи.

<img alt="structure_of_tasks" src="/images/Exercises.png" />

Тесты находятся в соответствующем пакете в папке *src/test/java*. 

<img alt="unit_tests" src="/images/UnitTests.png" />

Тесты можно запускать различными способами. Например, выполнить таск Gradle: *Gradle -> Tasks -> verification -> test*. Тогда прогонятся все unit-тесты сразу:

<img alt="launch test via Gradle" src="/images/RunTests.PNG" />

Или открыть класс с тестом и нажать на зелёный треугольник рядом с объявлением класса. Если все тесты пройдены успешно :smiley_cat:, они отмечаются зеленым значком :heavy_check_mark:, иначе :scream_cat: - красным :heavy_exclamation_mark:

:point_up: У многих после клонирования Task 3 студия не показывала значок запуска теста перед именем класса с тестом. Есть два совета:
- Используйте стабильную версию Android Studio, на данный момент 3.6.1 
- Клонируйте проект через консоль и затем открывайте в студии.

В любом случае, запуск через пункт Gradle в студии или через консоль будет работать. 

Если вы пришли к выводу, что выполнили максимум того что могли сделать, то сделайте Submit задачи через 
https://app.rs.school/
</br></br>

## Условия задач

### 1) Polynomial

A polynomial function can be represented by a vector of its coefficients. For instance p(x) = 5x^3 + 2x + 3 can be described as (5, 0, 2, 3). The latter representation is more 'computational friendly', while the first representation is more human readable.

Your task is to create function, which converts array of coefficients to equation. The function takes an array with the *Number* coefficients as a parameter. The coefficients array starts with the highest degree. The function should return the polynomial in a simpel human readable form. This means you skip 0 coefficient terms completely and you not write down 1 coefficients.

Please note that numbers could be negative. In case the input array is empty, return *null*.

Here is the example:

Input array [4, 0, 5, 20] should return "4x^3 + 5x + 20".

### 2) Combinator

You know combinations: for example, if you take 5 cards from a 52 cards deck you have 2,598,960 different combinations.

In mathematics the number of x combinations you can take from a set of n elements is called the binomial coefficient of n and x, or more often n choose x.

HINT: one of formulas(for m = n choose x) from combinatorics could help you with solution.

You are a renowned poster designer and painter. You are asked to provide 6 posters all having the same design each in 2 colors. Posters must all have a different color combination and you have the choice of 4 colors: red, blue, yellow, green. How many colors can you choose for each poster?

The answer is two since 4 choose 2 = 6. The combinations will be: {red, blue}, {red, yellow}, {red, green}, {blue, yellow}, {blue, green}, {yellow, green}.

Now same question but you have 35 posters to provide and 7 colors available. How many colors for each poster? If you take combinations 7 choose 2 you will get 21 with the above formula. But 21 schemes aren't enough for 35 posters. If you take 7 choose 5 combinations you will get 21 too. Fortunately if you take 7 choose 3 or 7 choose 4 combinations you get 35 and so each poster will have a different combination of 3 colors or 5 colors. You will take 3 colors because it's less expensive.

Hence the problem is:

knowing m (number of posters to design), knowing n (total number of available colors), let us search x (number of colors for each poster so that each poster has a unique combination of colors and the number of combinations is exactly the same as the number of posters). In other words you should create a function which takes m(*Number*) and n(*Number*) and returns x(*Number*). Some more conditions: m >= 0 and n > 0. If many x are solutions give as result the smallest x. It can happen that when m is given at random there are no x satisfying equation (1) then return *null*.

Here's the examples:

[6, 4] would return 2

[4, 4] would return 1

[4, 2] would return *null* 

</br></br>
:ok_hand:
