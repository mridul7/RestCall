package hello;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
class PostRequestBody {



    @Id
    private String userId;
    private String id;
    private String title;
    private String body;
    //default conatructor

    public PostRequestBody()
    {
    }
    public String getUserId()
    {
        return userId;
    }
    public void setUserId(String id)
    {
        this.userId = id;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getBody()
    {
        return body;
    }
    public void setBody(String body)
    {
        this.body = body;
    }
}