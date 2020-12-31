import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F11FDEFF567AF8E29BB8C01674605340284B0198D3B0F7E0AE7B13202477E64_137247486 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ViewGroup.class);
      ViewUtils.makeOptionalFitsSystemWindows((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
