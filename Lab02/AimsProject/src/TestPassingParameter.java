public class TestPassingParameter {
        public static void main(String[] args) {
            //TODO Auto-generated method stub
            DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
            DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

            DigitalVideoDisc[] dvdList = {jungleDVD, cinderellaDVD};
            swap(dvdList);

            System.out.println("jungle dvd title:" + dvdList[0].getTitle());
            System.out.println("cinderella dvd title: " + dvdList[1].getTitle());

            changeTitle(jungleDVD, cinderellaDVD.getTitle());
            System.out.println("jungle dvd title:" + jungleDVD.getTitle());
        }
        public static void swap(DigitalVideoDisc[] dvdList) {
            Object tmp = dvdList[0];
            dvdList[0] = dvdList[1];
            dvdList[1] = tmp;
        }
        public static void changeTitle(DigitalVideoDisc dvd, String title) {
            String oldTitle = dvd.getTitle();
            dvd.setTitle(title);
            dvd = new DigitalVideoDisc(oldTitle);
        }
}
