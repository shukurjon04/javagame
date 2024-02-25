package yangidaraxt;
class shox{
    int data;
    shox left,right;
    shox(int qiymat){
        data=qiymat;
        left=right=null;
    }
}
class binardaraxt{
    shox ildiz;
    binardaraxt(int qiymat){
        ildiz = new shox(qiymat);
    }
    void qoshish(int qiymat){
        ildiz = insertrekursiyasi(ildiz,qiymat);
    }

    shox insertrekursiyasi(shox bironqiymat, int qiymat) {
        if (bironqiymat==null){
            bironqiymat =new shox(qiymat);
            return bironqiymat;
        }
        if (qiymat < bironqiymat.data) {
            bironqiymat.left=insertrekursiyasi(bironqiymat.left,qiymat);
        }
        if (qiymat > bironqiymat.data) {
            bironqiymat.right = insertrekursiyasi(bironqiymat.right,qiymat);
        }
        return bironqiymat;
    }
    void print(){
        printrekursiyasi(ildiz);
    }

    void printrekursiyasi(shox bironqiymat) {
        if (bironqiymat==null){
            return;
        }
        printrekursiyasi(bironqiymat.left);
        System.out.print(bironqiymat.data + " ");
        printrekursiyasi(bironqiymat.right);

    }
}


public class yangidaraxt {
    public static void main(String[] args) {
        binardaraxt daraxr = new binardaraxt(1);
        daraxr.qoshish(2);
        daraxr.qoshish(3);
        daraxr.qoshish(4);
        daraxr.qoshish(5);
        daraxr.qoshish(6);
        daraxr.qoshish(7);
        daraxr.print();
    }
}
