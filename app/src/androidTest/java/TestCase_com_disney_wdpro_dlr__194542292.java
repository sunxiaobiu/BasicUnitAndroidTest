import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_disney_wdpro_dlr__194542292 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(FragmentActivity.class);
      Object var1 = EasyMock.createMock(Fragment.class);
      Object var2 = EasyMock.createMock(Intent.class);
      byte var3 = 1;
      Object var4 = EasyMock.createMock(Bundle.class);
      ((FragmentActivity)var5).startActivityFromFragment((Fragment)var1, (Intent)var2, var3, (Bundle)var4);
   }
}
