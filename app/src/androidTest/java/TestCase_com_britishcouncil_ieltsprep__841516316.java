import android.content.res.ColorStateList;
import android.support.v7.widget.AppCompatRadioButton;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_britishcouncil_ieltsprep__841516316 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatRadioButton.class);
      Object var1 = EasyMock.createMock(ColorStateList.class);
      ((AppCompatRadioButton)var2).setSupportButtonTintList((ColorStateList)var1);
   }
}
