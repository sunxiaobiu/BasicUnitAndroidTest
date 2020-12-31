import android.content.res.ColorStateList;
import android.support.v4.widget.CompoundButtonCompat;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_mobilesaude_forumdeacessoparagestores__1182597988 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(CheckBox.class);
      Object var1 = EasyMock.createMock(ColorStateList.class);
      CompoundButtonCompat.setButtonTintList((CompoundButton)var0, (ColorStateList)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
