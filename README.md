# Stringy-Math
A math library for Java that reseambles Java's StringBuilder but allows for mathmatical computations at unimited precision.

### TODO:
- Add methods for use of multiplication and division.
- Add sqrt functionality
- Documentation
- Testing
- Optimization

### Features
- Addition and Subtraction of Strings
- Logical Evaluations Equivalent to a > b **example** logic(a, b) may return true, equal, or false

#### How to Use:
```
import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {
		// Friendly Builder Style Pattern
		new DynamicNumber("53656.15452").subtract("-9.45587000000512").add("358.2").subtract("-8.1").println();
	}
}
```
