import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__456192363 {
   @Test
   public void testCase() throws Exception {
      StateListDrawable var1 = new StateListDrawable();
      ConstantState var2 = var1.getConstantState();
      DrawableContainerState var3 = (DrawableContainerState)var2;
      var3.setConstantSize(true);
   }
}
