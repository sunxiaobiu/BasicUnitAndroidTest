import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player__406141840 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(LayoutInflater.class);
      Object var1 = null;
      LayoutInflaterCompat.setFactory((LayoutInflater)var0, (LayoutInflaterFactory)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
