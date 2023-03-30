# master-to-detail-relationship-with-one-table

Usually the one to many relationship involves two tables but while working on the legacy code i found out to save multiple values of one parameter as a string instead of saving it in 
another table. the values which are saved as string then can be handled in the java such as if values are stored in json format 

# for example: 

{"jsonDetailTable":{"department":"IT","departmentDescription":"to provide IT services","departmentEmployeeCount":"80"}}

then these can be easily extracted from string into json and getting values in variables, list etc like:
JSONObject jsonObject = new JSONObject(jsonString);
department = jsonObject.getString("department");

# limiations
It seems exciting but it comes with some limiations the significant to remember while implementing this logic is the detailed table should be completely depended on the 
parent table meaning that it should not containa any foriegn key.
