package InnerClass;


class localinnerclass_1 {
    void m1()
    {
        class localouterclass_1{
            void software()
            {
                System.out.println("Software class");
            }
        }
        localouterclass_1 lo=new localouterclass_1();
        lo.software();
        }
        public static void main(String[] args) {
            localinnerclass_1 loi=new localinnerclass_1();
            loi.m1();
            
        }
    }
    
