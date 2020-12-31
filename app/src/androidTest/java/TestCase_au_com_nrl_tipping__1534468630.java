import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_nrl_tipping__1534468630 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ResolveInfo.class);
      IntentFilter var2 = ((ResolveInfo)var1).filter;
      boolean var3 = var2.hasCategory("android.intent.category.BROWSABLE");
   }
}
