package code;

import java.util.Objects;

/**
 * Created by 390767 on 17-5-23.
 */

class DynamicFieldsException extends Exception{}

public class DynamicFields {
    private Objects[][] fields;
    public DynamicFields(int initialSize){
        fields = new Objects[initialSize][2];
        for (int i=0;i<initialSize;i++)
            fields[i] = new Objects[]{null ,null};
    }
    public String toString(){
        StringBuilder result =new StringBuilder();
        for (Object[] obj:fields){
            result.append(obj[0]);
            result.append(" :");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }
    private int hasField(String id){
        for (int i =0 ;i<fields.length;i++)
            if(id.equals(fields[i][0]))
                return  i;
        return  -1;
    }

}
