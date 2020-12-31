import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_domobile_mixnote_1417190970 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Resources.class);
      AssetManager var4 = ((Resources)var3).getAssets();
      byte var1 = 1;
      String var2 = "android";
      var4.openNonAssetFd(var1, var2);
   }
}
