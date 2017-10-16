# Stringy-Math
A math library for Java that reseambles Java's StringBuilder but allows for mathmatical computations at unimited precision.

### TODO
- Fix the placement for the decimal point after multiplication, & division computation.
- Add sqrt functionality
- Documentation
- Testing
- Optimization

### Features
- Addition, Subtraction, and Multiplication of Strings
- Logical Evaluations Equivalent to a > b
  - **Example:**
    - logic(a, b) may return the String true, equal, or false

#### How to Use:
```

import arithmetic.numbers.DynamicNumber;
import logical.utils.LogicalUtils;

public class Main {
	public static void main(String... strings) {
		DynamicNumber number = new DynamicNumber("53656.15452").subtract("-9.45587000000512").add("358.2").subtract("-8.1");

		DynamicNumber max = new DynamicNumber("10");
		DynamicNumber index = new DynamicNumber("0");

		/**
		 * while(index < max) {
		 * 	number -= .001500000000040901;
		 *  index++;
		 * }
		 */
		while (LogicalUtils.getLogicalStatus(index, max) == "false") {
			number.subtract(".001500000000040901");
			index.add("1");
			index.println();
		}
		number.println();
	}
}
```
#### Console Output:
```
Value=1
Value=2
Value=3
Value=4
Value=5
Value=6
Value=7
Value=8
Value=9
Value=10
Value=54031.895390000004710990
```
