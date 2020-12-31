import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__851129836 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = EasyMock.createMock(Theme.class);
      Object var2 = EasyMock.createMock(AttributeSet.class);
      int[] var3 = new int[1];
      TypedArrayUtils.obtainAttributes((Resources)var0, (Theme)var1, (AttributeSet)var2, var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
