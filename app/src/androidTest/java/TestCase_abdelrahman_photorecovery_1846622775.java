import android.content.Context;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1846622775 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent();
      Object var1 = EasyMock.createMock(Context.class);
      var2.setClassName((Context)var1, "com.google.android.gms.ads.AdActivity");
   }
}
