import android.content.res.ColorStateList;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_nea_andy_retime_616156013 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutInflater.class);
      Object var1 = EasyMock.createMock(ViewGroup.class);
      View var3 = ((LayoutInflater)var2).inflate(2131427389, (ViewGroup)var1, false);
      AppCompatCheckBox var4 = (AppCompatCheckBox)var3;
      var1 = EasyMock.createMock(ColorStateList.class);
      var4.setSupportButtonTintList((ColorStateList)var1);
   }
}
