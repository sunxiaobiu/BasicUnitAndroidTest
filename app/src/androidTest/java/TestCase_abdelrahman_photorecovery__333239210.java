import android.content.Intent;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__333239210 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Intent.class);
      Object var1 = EasyMock.createMock(Bundle.class);
      ((Intent)var2).putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", (Bundle)var1);
   }
}
