package hello;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloGradleController {
   /* @RequestMapping(value= "/getData")
    public  void getData() throws IOException, JSONException {




        URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/1");

        String readLine = null;

        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();

        conection.setRequestMethod("GET");

        conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here

        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {

            BufferedReader in = new BufferedReader(

                    new InputStreamReader(conection.getInputStream()));

            StringBuffer response = new StringBuffer();

            while ((readLine = in .readLine()) != null) {

                response.append(readLine);

            } in .close();

            // print result
            JSONObject myobject = new JSONObject(response.toString());

            PostRequestBody postRequestBody = new PostRequestBody();
            postRequestBody = new Gson().fromJson(String.valueOf(myobject), PostRequestBody.class);

            // Show it.
            System.out.println("jsssssooooooon       "+postRequestBody.getId());


            System.out.println("aaaaaaaaa "+myobject);




            System.out.println("JSON String Result " + response.toString());

            //GetAndPost.POSTRequest(response.toString());

        } else {

            System.out.println("GET NOT WORKED");

        }
    }

    @RequestMapping(value="/postData")
    public void postData() throws IOException {
        final String POST_PARAMS = "{\n" + "\"userId\": 101,\r\n" +

                "    \"id\": 101,\r\n" +

                "    \"title\": \"Test Title\",\r\n" +

                "    \"body\": \"Test Body\"" + "\n}";

        System.out.println(POST_PARAMS);

        URL obj = new URL("https://jsonplaceholder.typicode.com/posts");

        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();

        postConnection.setRequestMethod("POST");

        postConnection.setRequestProperty("userId", "a1bcdefgh");

        postConnection.setRequestProperty("Content-Type", "application/json");

        postConnection.setDoOutput(true);

        OutputStream os = postConnection.getOutputStream();

        os.write(POST_PARAMS.getBytes());

        os.flush();

        os.close();

        int responseCode = postConnection.getResponseCode();

        System.out.println("POST Response Code :  " + responseCode);

        System.out.println("POST Response Message : " + postConnection);

        if (responseCode == HttpURLConnection.HTTP_CREATED) { //success

            BufferedReader in = new BufferedReader(new InputStreamReader(

                    postConnection.getInputStream()));

            String inputLine;

            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {

                response.append(inputLine);

            } in .close();

            // print result

            System.out.println(response.toString());

          //  PostRequestBody postRequestBody = new PostRequestBody();
           /// System.out.println( postConnection.getInputStream().);




            } else {

            System.out.println("POST NOT WORKED");

        }

    }
*/

    }





