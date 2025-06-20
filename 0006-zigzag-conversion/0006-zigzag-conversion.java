class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if there's only one row or string is too short
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create an array of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        
        // Initialize each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse the input string
        for (char c : s.toCharArray()) {
            // Append the current character to the current row
            rows[currentRow].append(c);

            // Change direction when we reach the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row based on direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into one final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
