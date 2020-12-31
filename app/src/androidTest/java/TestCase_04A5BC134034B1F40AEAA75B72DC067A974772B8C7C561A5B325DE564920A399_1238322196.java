import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_04A5BC134034B1F40AEAA75B72DC067A974772B8C7C561A5B325DE564920A399_1238322196 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService(SliceManager.class);
      SliceManager var5 = (SliceManager)var4;
      String var1 = "android";
      Object var2 = EasyMock.createMock(Uri.class);
      var5.grantSlicePermission(var1, (Uri)var2);
   }
}
