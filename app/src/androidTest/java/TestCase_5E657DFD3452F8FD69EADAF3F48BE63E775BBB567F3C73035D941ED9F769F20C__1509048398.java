import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__1509048398 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Uri.class);
      TypefaceCompatUtil.mmap((Context)var0, (CancellationSignal)null, (Uri)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
