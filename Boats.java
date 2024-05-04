    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); // Sort the people array
        int count = 0;
        int sum = 0;

        for (int i = 0; i < people.length; i++) {
            if (sum + people[i] <= limit) {
                sum += people[i]; // Add the weight of the current person to the current sum
                if (i == people.length - 1) { // If this is the last person
                    count++; // Need one more boat for the last person
                }
            } else {
                count++; // Need another boat if adding the current person exceeds the limit
                sum = people[i]; // Start a new boat with the weight of the current person
            }

        }

        return count;
    }
