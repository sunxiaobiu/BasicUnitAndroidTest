import android.content.ClipData;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player__745665229 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      ClipData var2 = ((Intent)var1).getClipData();
      int var3 = var2.getItemCount();
   }
}
