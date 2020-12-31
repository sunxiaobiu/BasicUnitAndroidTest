import android.content.res.ColorStateList;
import android.support.v4.widget.TintableCompoundButton;
import android.view.View;
import android.widget.RadioButton;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_653A5CC27DD0203EFB89B3A73EAE5BE1D5CC84C6F622B77D57CFB110E5321280__1004547120 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      RadioButton var3 = (RadioButton)var2;
      TintableCompoundButton var4 = (TintableCompoundButton)var3;
      Object var1 = EasyMock.createMock(ColorStateList.class);
      var4.setSupportButtonTintList((ColorStateList)var1);
   }
}
