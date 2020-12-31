import android.content.ClipData;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0342B657D749C98151D37798B802B4ABEC984A561FDF222268125A1719F454FB__82756841 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent("android.media.action.IMAGE_CAPTURE");
      Object var1 = EasyMock.createMock(ClipData.class);
      var2.setClipData((ClipData)var1);
   }
}
