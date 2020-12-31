import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_accaglobal_AccountingAndBusiness_Africa_1347718216 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      Drawable var3 = ((View)var2).getBackground();
      RippleDrawable var4 = (RippleDrawable)var3;
      byte var1 = 1;
      var4.findDrawableByLayerId(var1);
   }
}
