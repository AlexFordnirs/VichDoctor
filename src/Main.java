import java.util.*;
//Использовал я для листа  1 лист  отвечает за живую очередь , а другой лист отвечает за пациентов которых смог принять врач.
//Для организаций очереди я выбрал класический лист ArrayList/ выбран он был так как по сути представляет собой простой список (который аналогичен масиву)
//А вот для организаций записей доктора я взял ArrayDeque так как он работает по принципу двухнаправлености из-за чего мы можем произвести вставку и удаление как в начале коллекции, так и в ее конце
// Что может помочь нам в дальнейшем для развитие программы  так как  есть большое наличие методов что дает нам довольно хорошую гибкость в коде.

public class Main {
    public static void main(String[] args) {
        int pD=1,i=0,it=0,Age,KolVo,CHOLOVIKIV=0,JINOK=0;
        String Name;String Pol;
        System.out.println("Start");
        ArrayList<Pachient> VichDoctor = new ArrayList<>();

        ArrayDeque<Pachient> VichDoctorPosetili = new ArrayDeque<>();
        System.out.println("Заполнение пациентов :");
        Scanner scanner = new Scanner(System.in);
        while (pD==1)
        {
           i++;
            System.out.println("Пациент №"+i);
            System.out.println("Ввдите Имя пациента ");
           Name=scanner.nextLine();
            System.out.println("Ввдите Возраст пациента ");
            Age= Integer.parseInt(scanner.nextLine());
            System.out.println("Ввдите Пол (W/C)пациента ");
          Pol=scanner.nextLine();
          if(Pol.equals("W")||Pol.equals("C")){}else{System.out.println("Были введены некорректные данные повторитте ввод \nВвдите Пол (Ж/М)пациента "); Pol=scanner.nextLine();}
            System.out.println("Продолжить Ввод ?(Yes->1)/(No->0)");
          pD=Integer.parseInt(scanner.nextLine());
            VichDoctor.add(new Pachient(Name,Age,Pol));
        }
        System.out.println("Введите количество пациентов которое сможете принять сегодня ->");
        KolVo=scanner.nextInt();
        for (Pachient tmp: VichDoctor)
        {
            if(it<KolVo) {
                VichDoctorPosetili.add(new Pachient(tmp.getName(), tmp.getAge(), tmp.getPol()));
                if(tmp.getPol().equals("W")){CHOLOVIKIV++;} else if (tmp.getPol().equals("C")){JINOK++;}
            }
            it++;
        }
        System.out.println("Женщин было на приеме->"+JINOK+"\nМужчин было на приеме->"+CHOLOVIKIV);
        for (Pachient tmps: VichDoctorPosetili)
        {
            tmps.getDay();

        }
    }
}
