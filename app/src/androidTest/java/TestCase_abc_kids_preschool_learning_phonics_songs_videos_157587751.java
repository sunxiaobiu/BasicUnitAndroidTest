import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos_157587751 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Uri.class);
      Intent var1 = new Intent("android.intent.action.VIEW", (Uri)var2);
      var1.setSelector((Intent)null);
   }
}
