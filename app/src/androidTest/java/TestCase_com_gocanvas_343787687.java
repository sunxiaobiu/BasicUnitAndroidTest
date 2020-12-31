import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils.TruncateAt;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gocanvas_343787687 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      AppCompatCheckBox var2 = new AppCompatCheckBox(var1);
      Object var3 = EasyMock.createMock(TruncateAt.class);
      var2.setEllipsize((TruncateAt)var3);
   }
}
