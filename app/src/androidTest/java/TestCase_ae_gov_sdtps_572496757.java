import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_sdtps_572496757 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      short var2 = ((Intent)var1).getShortExtra("mapvariant", (short)0);
   }
}
