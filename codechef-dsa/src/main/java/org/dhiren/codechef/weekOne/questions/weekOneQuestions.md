>Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

Example
>Input:

1

2

88

42

99

>Output:

1 

2

88

---

>If an Integer N, write a program to reverse the given number.

Input:

> The first line contains an integer T, total number of 
testcase. Then follow T lines, each line contains an integer N.

Output
> Display the reverse of the given number N.

Constraints

> 1 ≤ T ≤ 1000

> 1 ≤ N ≤ 1000000

Example

>Input

4

12345

31203

2123

2300

>Output

54321

30213

3212

32

---

> Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
>First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.

Output:

>For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
Constraints:
1 ≤ T ≤ 100
2 ≤ |S| ≤ 1000, where |S| denotes the length of S

Example:
>Input:

6

gaga

abcde

rotor

xyzxy

abbaab

ababc


> Output:

YES

NO

YES

YES

NO

NO