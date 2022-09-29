import java.util.*;

class Mobile{

        HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
        public String addMobile(String company, String model){
            if(mobiles.containsKey(company)){
                ArrayList<String> tempList = mobiles.get(company);
                tempList.add(model);
                mobiles.replace(company, tempList);
            }else{

                ArrayList<String> tempList = new ArrayList<String>();
                tempList.add(model);
                mobiles.put(company, tempList);
            }
            return "model successfully added";
        }
        public ArrayList<String> getModels(String company){
            if(mobiles.containsKey(company)){
                ArrayList<String> temp = mobiles.get(company);
                if(!temp.isEmpty())
                    return temp;
            }
            return null;
        }
        public String buyMobile(String Company, String model){
            if(mobiles.containsKey(Company)){
                ArrayList<String> temp = mobiles.get(Company);
                if(temp.contains(model)){
                    temp.remove(model);
                    //update the list in Map
                    mobiles.put(Company, temp);
                    return "mobile sold successfully";
                }
            }
            return "item not available";
        }
    }

    public class MobileShop {
        public static void main(String args[] ) throws Exception {

            Mobile obj = new Mobile();
            Scanner sc = new Scanner(System.in);
            String company = sc.nextLine();
            String model = sc.nextLine();
            System.out.println(obj.addMobile("Oppo", "K3"));
            System.out.println(obj.getModels("Oppo"));
            System.out.println(obj.buyMobile("Oppo", "K3"));
            sc.close();
        }
    }

