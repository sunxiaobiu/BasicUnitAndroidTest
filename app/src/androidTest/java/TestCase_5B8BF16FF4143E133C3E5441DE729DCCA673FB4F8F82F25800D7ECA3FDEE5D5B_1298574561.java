import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B8BF16FF4143E133C3E5441DE729DCCA673FB4F8F82F25800D7ECA3FDEE5D5B_1298574561 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      RecyclerView var3 = (RecyclerView)var2;
      LayoutManager var4 = var3.getLayoutManager();
      Object var1 = EasyMock.createMock(AccessibilityEvent.class);
      var4.onInitializeAccessibilityEvent((AccessibilityEvent)var1);
   }
}
