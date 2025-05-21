import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("يا وعدي على الايام ", "يا وعدي ع الأيام، بتعدّي بينا قوام يا وعدي ع الأيام، بتعدّي بينا قوام وبتدّي ما بتدّيش، ندبل وهي تعيش غرورة، غرورة، ما بيَديش");
        userMap.put("Shape of you", "A club isn't the best place to find a lover So the bar is where I go (Mm) Me and my friends at the table doin' shots Drinkin' fast and then we talk slow (Mm) And you come over and start up a conversation with just me And trust me, I'll give it a chance now (Mm) Take my hand, stop, put Van the Man on the jukebox And then we start to dance, and now I'm singin' like");
        userMap.put("Skyfall", "This is the end Hold your breath and count to ten Feel the Earth move and then Hear my heart burst again For this is the end I've drowned and dreamt this moment So overdue, I owe them Swept away, I'm stolen Let the sky fall When it crumbles We will stand tall Face it all together Let the sky fall When it crumbles We will stand tall Face it all together At Skyfall At Skyfall Skyfall is where we start A thousand miles and poles apart Where worlds collide and days are dark You may have my number, you can take my name But you'll never have my heart Let the sky fall (let the sky fall) When it crumbles (when it crumbles) We will stand tall (we will stand tall) Face it all together Let the sky fall (let the sky fall) When it crumbles (when it crumbles) We will stand tall (we will stand tall) Face it all together At Skyfall Where you go, I go What you see, I see I know I'd never be me Without the security Of your loving arms Keeping me from harm Put your hand in my hand And we'll stand Let the sky fall (let the sky fall) When it crumbles (when it crumbles) We will stand tall (we will stand tall) Face it all together Let the sky fall (let the sky fall) When it crumbles (when it crumbles) We will stand tall (we will stand tall) Face it all together At Skyfall Let the sky fall We will stand tall At Skyfall Ooh");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println("Track: "+key);
            System.out.println("Lyrics: "+userMap.get(key));    
        }
    }
}
