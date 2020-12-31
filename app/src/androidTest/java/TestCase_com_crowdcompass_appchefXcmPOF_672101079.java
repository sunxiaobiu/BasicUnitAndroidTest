import android.content.Intent;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_crowdcompass_appchefXcmPOF_672101079 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent();
      Object var1 = EasyMock.createMock(Uri.class);
      var2.setDataAndNormalize((Uri)var1);
   }
}
