✅ Supported Input Formats:
[1,2,3,4]

[1, 2, 3, 4]

1,2,3,4

1 2 3 4

1, 2 3,4 (even mixed commas and spaces) 


public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array input (formats like [1, 2, 3], 1 2 3, or 1,2,3):");
        String line = sc.nextLine();

        // Step 1: Remove brackets if present
        line = line.replaceAll("\\[|\\]", "");

        // Step 2: Split using regex: commas and/or whitespace
        String[] input = line.trim().split("[,\\s]+");

        // Step 3: Convert to int[]
        int n = input.length;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Step 4: Print array
        System.out.print("You entered: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


| Step                 | Description                            |                  |
| -------------------- | -------------------------------------- | ---------------- |
| \`replaceAll("\\\[   | \\]", "")\`                            | Removes brackets |
| `split("[,\\s]+")`   | Splits on one or more commas or spaces |                  |
| `Integer.parseInt()` | Converts each string to integer        |                  |


| Purpose              | Method Used          |
| -------------------- | -------------------- |
| Read full line input | `sc.nextLine()`      |
| Clean input          | `.trim()`            |
| Split input smartly  | `.split("[,\\s]+")`  |
| Convert to integers  | `Integer.parseInt()` |
