//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package hw_2;


import org.json.JSONObject;

import java.util.Iterator;

public class task_1 {
    public static void main(String[] args) {
        String filter = generateWhereClause("select * from students where ", getFilterParams());
        System.out.println(filter);
    }

    public static JSONObject getFilterParams() {
        String jsonStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        return new JSONObject(jsonStr);
    }

    public static String generateWhereClause(String query, JSONObject filterParams) {
        StringBuilder sb = new StringBuilder(query);
        Iterator<String> keys = filterParams.keys();
        System.out.println();
        int count = 0;
        while(keys.hasNext()) {
            String key = keys.next();
            String value = filterParams.optString(key, null);
            if (value != null && !"null".equals(value)) {
                if (count != 0) {
                    sb.append(" AND ");
                }
                sb.append(key);
                sb.append("='");
                sb.append(value);
                sb.append("'");
                count++;
            }
        }
        return sb.toString();
    }

}
