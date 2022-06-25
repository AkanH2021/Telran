public class MainRecursion {
    /*  Ханойская башня: s - source  h - helper   d - destination
    S -> H   S -> D    H -> D
    Рекусрсионнъй алгоритм:
    1. Переместитъ n-1 диск с S на H, исполъзуя D;
    2. Переместитъ последниий диск с S на D;
    3. Переместитъ n-1 диск с Н на D, исполъзуя -> S    */
    public static void main(String[] args) {
        int countOfDisk = 3;
        String source = "source";
        String helper = "helper";
        String destination = "destination";

        towerOfHanoiRecursion(countOfDisk, source, helper, destination);
    }
        private static void towerOfHanoiRecursion ( int countOfDisk, String source, String helper, String destination){
   //   1. Переместитъ n-1 диск с S на H, исполъзуя D;
   //   2. Переместитъ последниий диск с S на D;
   //   3. Переместитъ n-1 диск с Н на D, исполъзуя -> S

            if (countOfDisk == 0) {
                return;
            }
            towerOfHanoiRecursion(countOfDisk - 1, source, destination, helper);
            printMove(countOfDisk, source, destination);
            towerOfHanoiRecursion(countOfDisk - 1, helper, source, destination);
        }


        private static void printMove ( int disk, String src, String dest){
            System.out.println("move the disk " + disk + " from " + src + " to " + dest);
        }
    }



