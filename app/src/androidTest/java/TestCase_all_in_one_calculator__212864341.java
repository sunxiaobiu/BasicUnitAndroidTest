import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_all_in_one_calculator__212864341 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ViewHolder.class);
      View var2 = ((ViewHolder)var1).itemView;
      ViewPropertyAnimatorCompat var3 = ViewCompat.animate(var2);
      var3 = var3.translationZ(0.0F);
   }
}
