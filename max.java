public class Main 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
 
        Optional<Integer> maxNumber = list.stream()
                    .max((i, j) -> i.compareTo(j));
 
        System.out.println(maxNumber.get());
    }
}