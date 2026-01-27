public class AllocatingBooks {
    public static void main(String[] args) {
        // int[] bookPages = { 25, 46, 28, 49, 24 };
        int[] bookPages = { 10, 20, 30, 40 };
        int students = 2;
        int minPages = bruteApproach(bookPages, students);
        System.out.println(minPages);
        int minPages2 = binaryApproach(bookPages, students);
        System.out.println(minPages2);

    }

    public static int bruteApproach(int[] pages, int students) {
        if (students > pages.length)
            return -1;
        int low = 0;
        int high = 0;
        for (int i : pages) {
            low = Math.max(low, i);
            high += i;
        }
        for (int maxPages = low; maxPages <= high; maxPages++) {
            int neededStudents = countStudent(pages, maxPages);
            if (neededStudents <= students)
                return maxPages; // first possible answer
        }

        return -1;
    }

    public static int countStudent(int[] arr, int maxPages) {
        int students = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxPages)
                pages += arr[i];
            else {
                students++;
                pages = arr[i];
            }

        }

        return students;
    }

    public static int binaryApproach(int[] pages, int students) {
        if (students > pages.length)
            return -1;
        int low = 0;
        int high = 0;
        for (int i : pages) {
            low = Math.max(low, i);
            high += i;
        }
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // try this maxPage
            int neededStudents = countStudent(pages, mid);
            if (neededStudents <= students) {
                ans = mid; // possible ans
                high = mid - 1; // but still trying smaller
            } else
                low = mid + 1; // need more pages
        }

        return ans; // or return low
        // All values < low → NOT possible
        // All values ≥ low → POSSIBLE (or unknown but converge)
        // when loop ends low>high
        // high is last not possible value
        // low is first possible value == smallet valid max pages;
    }

}
