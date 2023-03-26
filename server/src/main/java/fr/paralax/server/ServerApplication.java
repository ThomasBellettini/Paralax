package fr.paralax.server;

import fr.paralax.server.entity.manager.TileManager;
import fr.paralax.server.entity.story.Story;
import fr.paralax.server.storage.GStorage;
import fr.paralax.server.storage.StorageClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner {

    public static ServerApplication getInstance;
    public GStorage<Story> storyGStorage = new GStorage<>();

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        getInstance = this;
        TileManager.init();

        storyGStorage.init("./story/", Story.class);

    //    Story story = new Story("Tom Le PD", "password", TileManager.tileManagerList.get(0).getUuid());
    //    storyGStorage.saveEntity(story);
    }
}
