import android.content.Context;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__1012513430 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      File var1 = TypefaceCompatUtil.getTempFile((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
