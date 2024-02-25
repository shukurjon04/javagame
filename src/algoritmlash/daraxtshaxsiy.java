package algoritmlash;

class tugun{
        int key;
        tugun chap , ong ;
        public tugun(int belgi){
            key =belgi;
            chap = ong = null;
        }
    }
    class daraxt{
        tugun ildiz;
        void qoshish(int key){
            ildiz = insertRec(ildiz,key);
        }
        tugun insertRec(tugun ildiz,int key){
            if (ildiz == null) {
                ildiz = new tugun(key);
                return ildiz;
            }
            if (key < ildiz.key){
                ildiz.chap = insertRec(ildiz.chap,key);
            }
            if (key> ildiz.key){
                ildiz.ong = insertRec(ildiz.ong,key);
            }
            return ildiz;
        }
        void aylanib(tugun ildiz){
            if (ildiz!= null){
                aylanib(ildiz.chap);
                System.out.println(ildiz.key+" ");
                aylanib(ildiz.ong);
            }
        }
        void chiqar(){
            aylanib(ildiz);
        }
        public static void main(String[] args) {
            daraxt daraxt = new daraxt();
            int arr[] = {4, 3, 5, 1, 7, 8, 6, 2};
            for (int i = 0; i < arr.length; i++) {
               daraxt.qoshish(arr[i]);
            }
            daraxt.chiqar();
        }
    }


