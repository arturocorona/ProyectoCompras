package com.compras.proyecto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static spark.Spark.*;
/**
 *
 * @author arturo
 */
public class SparkTest {
    public static void main(String[] args) {
//    //http://localhost:4567/hello
//        get("/hello", (req, res) -> "Prueba de spark");
        
        
//        get("/home/:user", (req, res) -> {
//            
//            String usuario = "Arturo";
//            
//        });
            //http://localhost:4567
            //http://localhost:4567/home/luis/ramirez
            
//            String usuario = req.params("user") != null ?
//                    req.params("user") : "no logeado";
//            
//            usuario = req.params("apellido")  != null ?
//                    String.format("%s %s", usuario, req.params("apellido")) :
//                    usuario;
//
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("blogPu");
//            EntityManager em = emf.createEntityManager();
//
//            //Post p = new Post("un post chidote", "mi super post", new Date());
//            em.getTransaction().begin();
//            Post p = new Post();
//
//            //Se puede usar la estrategía DAO o active record
//            //En lugar de usar SQL hibernate usa HQL
//            Query q = em.createQuery("SELECT p FROM Post p");
//            List<Post> posts = q.getResultList();
//
//            em.getTransaction().commit();
//            em.close();
//            em.persist(p);
//
//            Configuration freeMarkerConfiguration = new Configuration();
//            freeMarkerConfiguration.setTemplateLoader(new ClassTemplateLoader(Home.class, "/"));
//            StringWriter writer = new StringWriter();
//            Template homeTemplate = freeMarkerConfiguration.getTemplate("home.ftl");
//            Map<String, Object> parametros = new HashMap<>();
//
//            parametros.put("posts", posts);
//            parametros.put("usuario", usuario);
//
//            homeTemplate.process(parametros, null);
//
//            return writer;
//        });
//        
//    post("/registrar", (req, res) -> {
//        //en get req.params
//        //en post req.queryparams
//        return req.queryParams("nombre");
//    });
    }
}
