package algoritmlash1115topshiriqlar;

class tugun {
    int malumoti;
    tugun ong, chap;

    tugun(int qiymat) {
        malumoti = qiymat;
        ong = chap = null;
    }
}

class Tree {
    tugun ildiz;

    Tree(int qiymat) {
        ildiz = new tugun(qiymat);
    }

    void qoshish(int qiymat) {
        ildiz = takroriyqosh(ildiz, qiymat);
    }

    tugun takroriyqosh(tugun ildiz, int qiymat) {
        if (ildiz == null) {
            ildiz = new tugun(qiymat);
            return ildiz;
        }
        if (qiymat < ildiz.malumoti) {
            ildiz.chap = takroriyqosh(ildiz.chap, qiymat);
        }
        if (qiymat > ildiz.malumoti) {
            ildiz.ong = takroriyqosh(ildiz.ong, qiymat);
        }
        return ildiz;
    }

    void print() {
        takroriychiqar(ildiz);
    }

    void takroriychiqar(tugun ildiz) {
        if (ildiz == null) {
            return;
        } else {
            takroriychiqar(ildiz.chap);
            System.out.println(ildiz.malumoti + "  ");
            takroriychiqar(ildiz.ong);
        }
    }
}

public class daraxt {
    public static void main(String[] args) {
        Tree dast = new Tree(89);
        dast.qoshish(63);
        dast.qoshish(45);
        dast.qoshish(32);
        dast.qoshish(22);
        dast.qoshish(55);
        dast.qoshish(45);
        dast.qoshish(69);
        dast.qoshish(56);
        dast.qoshish(41);
        dast.print();
    }
}
