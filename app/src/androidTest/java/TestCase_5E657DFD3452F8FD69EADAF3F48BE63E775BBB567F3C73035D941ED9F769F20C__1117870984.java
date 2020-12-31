import android.content.Context;
import android.content.res.Resources;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__1117870984 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Resources.class);
      byte var2 = 1;
      TypefaceCompatUtil.copyToDirectBuffer((Context)var0, (Resources)var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
